package com.cloudmersive;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.model.VirusScanResult;

import java.io.File;

import com.cloudmersive.client.ScanApi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! We are about to start scanning");
        ApiClient defauClient = Configuration.getDefaultApiClient();

        // configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth)defauClient.getAuthentication("Apikey");
        Apikey.setApiKey("API KEY HERE");

        ScanApi apiInstance = new ScanApi();

        File inpuFile = new File("/Users/samuelnganga/Downloads/cv.pdf");

        try{
            VirusScanResult result = apiInstance.scanFile(inpuFile);
            System.out.println(result);
        } catch (ApiException e){
            System.err.println("Exception when calling ScanAPI#scanFile");
            e.printStackTrace();
        }
        



    }
}