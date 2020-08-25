package com.bankele.jobs;

import com.bankele.entity.Atm;
import com.bankele.entity.Branch;
import com.bankele.entity.Brand;
import com.bankele.repository.BrandRepository;
import com.bankele.service.MainService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccessBank {
//    private final MainService mainService;
//    private final BrandRepository brandRepository;
//    private List<String> dataWithoutPoi = new ArrayList<>();
//
//    public AccessBank(MainService mainService, BrandRepository brandRepository) {
//        this.mainService = mainService;
//        this.brandRepository = brandRepository;
//    }
//
//    @PostConstruct
//    private void getMapData() {
//        Brand brand = brandRepository.findByName("Access").orElse(new Brand("Access"));
//        mainService.saveBrand(brand);
//
//        List<String> data = getUrlContents("https://www.accessbank.az/bitrix/templates/MainTemplate/js/poi_az.js");
//        for (int i = 1; i < data.size(); i++) {
//            String removedPoi = data.get(i).replace("$poi[" + i + "] =", "");
//            String replaceDot = removedPoi.replace(";","");
//            String removedBr = replaceDot.replace("<br/>", "\n");
//            String removeBr2 = removedBr.replace("<br>", "\n");
//            dataWithoutPoi.add(removeBr2);
//        }
////        System.out.println("Rafael data " + dataWithoutPoi);
////        jsonToObject(dataWithoutPoi);
//        parseAtmJson("{\"myArray\":" + dataWithoutPoi + "}", brand);
//
//    }
//
//    private void parseAtmJson(String stringJSON, Brand brand) {
//        try {
//            JSONArray jArray = new JSONObject(stringJSON).getJSONArray("myArray");
//
//            for (int i = 0; i < jArray.length(); i++) {
//                System.out.println("Rafael size " + jArray.length());
//                JSONObject jObj = jArray.getJSONObject(i);
//                if (jObj.getInt("type") == 1) {
//                    Atm atm = new Atm();
//                    atm.setLng(jObj.getString("lng"));
//                    atm.setLat(jObj.getString("lat"));
//                    atm.setAddress(jObj.getString("text"));
//                    atm.setCity(jObj.getString("name"));
//
//                    atm.setBrand(brand);
//                    mainService.saveAtm(atm);
//                } else if (jObj.getInt("type") == 2) {
//                    Branch branch = new Branch();
//                    branch.setLng(jObj.getString("lng"));
//                    branch.setLat(jObj.getString("lat"));
//                    branch.setName(jObj.getString("name"));
//                    branch.setAddress(jObj.getString("text"));
//                    branch.setPhone("");
//                    branch.setBrand(brand);
//                    mainService.saveBranch(branch);
//                }
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
////    private void jsonToObject(List<String> data) {
////        for (int i = 0; i < data.size(); i++) {
////            try {
////                JSONObject jsonObject = new JSONObject(data.get(i));
////                System.out.println("Rafael data " + jsonObject);
////            } catch (JSONException err) {
////                System.out.println("Rafael data " + err.toString());
////            }
////        }
////    }
//
//    private static List<String> getUrlContents(String theUrl) {
////        StringBuilder content = new StringBuilder();
//        List<String> accessBankBranchesAndAtms = new ArrayList<>();
//
//        // many of these calls can throw exceptions, so i've just
//        // wrapped them all in one try/catch statement.
//        try {
//            // create a url object
//            URL url = new URL(theUrl);
//
//            // create a urlconnection object
//            URLConnection urlConnection = url.openConnection();
//
//            // wrap the urlconnection in a bufferedreader
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//            String line;
//
//            // read from the urlconnection via the bufferedreader
//            while ((line = bufferedReader.readLine()) != null) {
////                content.append(line + "\n");
//                accessBankBranchesAndAtms.add(line + "\n");
//            }
//            bufferedReader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return accessBankBranchesAndAtms;
//    }
}
