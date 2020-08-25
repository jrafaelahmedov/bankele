package com.bankele.jobs;

import com.bankele.entity.Atm;
import com.bankele.entity.Branch;
import com.bankele.entity.Brand;
import com.bankele.repository.BrandRepository;
import com.bankele.service.MainService;
import netscape.javascript.JSObject;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;

@Component
public class BeynelxalqBank {

    private final MainService mainService;

    private final BrandRepository brandRepository;

    private List<Document> documentListBranches = new ArrayList<>();
    private List<Document> documentListAtms = new ArrayList<>();
    private String urlBranches = "https://www.ibar.az/az/service-network";
    private String urlAtms = "https://www.ibar.az/az/service-network/atm/";
    private List<Elements> branchElements = new ArrayList<>();
    private List<Elements> atmElements = new ArrayList<>();


    public BeynelxalqBank(MainService mainService, BrandRepository brandRepository) {
        this.mainService = mainService;
        this.brandRepository = brandRepository;
    }


    @PostConstruct
    private void getMapData() {

        Brand brand = brandRepository.findByName("Beynelxalq").orElse(new Brand("Beynelxalq"));

        mainService.saveBrand(brand);

        try {
            Document document = Jsoup.connect(urlBranches).get();
            String js = document.getElementsByClass("inner_scroll").get(0).select("script").get(1).html();
            JSONObject jsonObject = new JSONObject(js.replace("var locations = ", "")).getJSONObject("branch");
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONArray jsonArr = (JSONArray) jsonObject.get(key);
                Branch branch = new Branch();
                branch.setLng(jsonArr.getString(1));
                branch.setLat(jsonArr.getString(2));
                branch.setName(jsonArr.getString(0));
                branch.setAddress(jsonArr.getString(5));
                branch.setPhone(jsonArr.getString(4));
                branch.setBrand(brand);
                mainService.saveBranch(branch);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }


        try {
            Document document1 = Jsoup.connect(urlAtms).get();
            String js = document1.getElementsByClass("inner_scroll").get(0).select("script").get(1).html();
            JSONObject jsonObject = new JSONObject(js.replace("var locations = ", "")).getJSONObject("branch");
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONArray jsonArr = (JSONArray) jsonObject.get(key);
                Atm atm = new Atm();
                atm.setLng(jsonArr.getString(1));
                atm.setLat(jsonArr.getString(2));
                atm.setCity(jsonArr.getString(0));
                atm.setAddress(jsonArr.getString(4));
                atm.setBrand(brand);
                mainService.saveAtm(atm);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
