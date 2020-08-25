package com.bankele.jobs;

import com.bankele.entity.Atm;
import com.bankele.entity.Branch;
import com.bankele.entity.Brand;
import com.bankele.repository.BrandRepository;
import com.bankele.service.MainService;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.json.JSONArray;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class KapitalBank {
//
//    private final MainService mainService;
//
//    private final BrandRepository brandRepository;
//
//    private List<Document> documentListBranches = new ArrayList<>();
//    private List<Document> documentListAtms = new ArrayList<>();
//    // 12 sehifeden ibaretdir
//    private String urlBranches = "https://kapitalbank.az/locations/branch/all?page=";
//    // 71 sehifeden ibaretdir
//    private String urlAtms = "https://kapitalbank.az/locations/atm/all?page=";
//    private List<Elements> branchElements = new ArrayList<>();
//    private List<Elements> atmElements = new ArrayList<>();
//
//    public KapitalBank(MainService mainService, BrandRepository brandRepository) {
//        this.mainService = mainService;
//        this.brandRepository = brandRepository;
//    }
//
//    @PostConstruct
//    private void getMapData() {
//
//        Brand brand = brandRepository.findByName("Kapital").orElse(new Brand("Kapital"));
//
//        mainService.saveBrand(brand);
//        try {
//            for (int i = 1; i < 13; i++) {
//                documentListBranches.add(Jsoup.connect(urlBranches + i).get());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < 12; i++) {
//            if (documentListBranches.get(i) != null) {
//                branchElements.add(documentListBranches.get(i).select("script"));
//            }
//        }
//        for (int i = 0; i < 12; i++) {
//            if (branchElements.get(i) != null) {
//                for (DataNode node : branchElements.get(i).get(branchElements.get(i).size() - 1).dataNodes()) {
//                    String[] result = node.getWholeData().split("\n", 2);
//                    String brReplaced = result[0].replace("<br><br>", " , ");
//                    String resultFresh = brReplaced.replace(";", "");
//                    String resultWithoutVarLocation = resultFresh.replace("var locations = ", "");
//                    System.out.println("Rafael branches" + resultWithoutVarLocation);
//                    parseBranchJson("{\"myArray\":" + resultWithoutVarLocation + "}", brand);
//                }
//            }
//        }
//
//        try {
//            for (int i = 1; i < 72; i++) {
//                documentListAtms.add(Jsoup.connect(urlAtms + i).get());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < 71; i++) {
//            if (documentListAtms.get(i) != null) {
//                atmElements.add(documentListAtms.get(i).select("script"));
//            }
//        }
//        for (int i = 0; i < 71; i++) {
//            if (atmElements.get(i) != null) {
//                for (DataNode node : atmElements.get(i).get(atmElements.get(i).size() - 1).dataNodes()) {
//                    String[] result = node.getWholeData().split("\n", 2);
//                    String brReplaced = result[0].replace("<br><br>", "\",\"");
//                    String resultFresh = brReplaced.replace(";", "");
//                    String resultWithoutVarLocation = resultFresh.replace("var locations = ", "");
////                    System.out.println("Rafael atms" + resultWithoutVarLocation);
//                    parseAtmJson("{\"myArray\":" + resultWithoutVarLocation + "}", brand);
//
//                }
//            }
//        }
//    }
//
//    private void parseAtmJson(String stringJSON, Brand brand) {
//        try {
//            JSONArray jArray = new JSONObject(stringJSON).getJSONArray("myArray");
//
//            for (int i = 0; i < jArray.length(); i++) {
//                JSONObject jObj = jArray.getJSONObject(i);
//                Atm atm = new Atm();
//                atm.setLng(jObj.getString("lng"));
//                atm.setLat(jObj.getString("lat"));
//                atm.setAddress(jObj.getString("title"));
//                atm.setCity(jObj.getString("city"));
//                atm.setBrand(brand);
//                mainService.saveAtm(atm);
//
////                System.out.println(i + " id : " + jObj.getInt("id"));
////                System.out.println(i + " att1 : " + jObj.getDouble("att1"));
////                System.out.println(i + " att2 : " + jObj.getBoolean("att2"));
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void parseBranchJson(String stringJSON, Brand brand) {
//        try {
//            JSONArray jArray = new JSONObject(stringJSON).getJSONArray("myArray");
//
//            for (int i = 0; i < jArray.length(); i++) {
//                JSONObject jObj = jArray.getJSONObject(i);
//                Branch branch = new Branch();
//                branch.setLng(jObj.getString("lng"));
//                branch.setLat(jObj.getString("lat"));
//                branch.setName(jObj.getString("title"));
//                branch.setAddress(jObj.getString("city"));
//                branch.setPhone(jObj.getString("phone"));
//                branch.setBrand(brand);
//                mainService.saveBranch(branch);
//
////                System.out.println(i + " id : " + jObj.getInt("id"));
////                System.out.println(i + " att1 : " + jObj.getDouble("att1"));
////                System.out.println(i + " att2 : " + jObj.getBoolean("att2"));
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }

}
