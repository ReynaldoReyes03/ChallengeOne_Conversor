package com.rmr.converter.currency;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmr.converter.currency.models.APIResponse;
import com.rmr.converter.currency.models.PairConversion;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public abstract class FetchExchangeRateAPI {
    private static APIResponse apiResponse;
    private static PairConversion pairConversion;
    
    private static void setResponsesToNull() {
        apiResponse = null;
        pairConversion = null;
    }
    
    private static void fetchAPI(String url, FetchType type) {
        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .header("Authorization", "Bearer " + APIKey.getApiKey())
                    .build();
            
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            String json = getResponse.body();
            ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            
            switch (type) {
                case GET_ALL -> apiResponse = mapper.readValue(json, new TypeReference<APIResponse>() {});
                case PAIR_CONVERSION -> pairConversion = mapper.readValue(json, new TypeReference<PairConversion>() {});
                default -> System.out.println("Algo salió mal con el enum.");
            }
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            setResponsesToNull();
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
            setResponsesToNull();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            setResponsesToNull();
        }
    }
    
    public static APIResponse getAll(String url) throws NullPointerException, ApiInternalErrorException {
        fetchAPI(url, FetchType.GET_ALL);
        
        if (apiResponse == null) throw new NullPointerException("Algo salió mal con la conversión.");
        if (!apiResponse.getResult().equalsIgnoreCase("success")) throw new ApiInternalErrorException(pairConversion.getErrorType());
        
        return apiResponse;
    }
    
    public static PairConversion pairConversion(String url) throws NullPointerException, ApiInternalErrorException {
        fetchAPI(url, FetchType.PAIR_CONVERSION);
        
        if (pairConversion == null) throw new NullPointerException("Algo salió mal con la conversión.");
        if (!pairConversion.getResult().equalsIgnoreCase("success")) throw new ApiInternalErrorException(pairConversion.getErrorType());
        
        return pairConversion;
    }
}
