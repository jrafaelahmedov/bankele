package com.bankele.jobs;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class AFBBank {

//    private Document document;
//
//    @PostConstruct
//    private void getMapData() {
//        try {
//            for (int i = 1; i < 13; i++) {
//                document = Jsoup.connect("https://afb.az/az/main").get();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        document.select("script");
//
//        System.out.println("Rafael "+document);
//    }
}
