package com.example.userservice.client;

import com.example.userservice.error.FeignErrorDecoder2;
import com.example.userservice.vo.ResponseCatalog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="catalog-service", configuration = FeignErrorDecoder2.class)
public interface CatalogServiceClient {

    @GetMapping("/catalog-service/getCatalogs_wrong")
    List<ResponseCatalog> getCatalogs();

    @GetMapping("/catalog-service/{productId}/stock")
    int getCatalogStock(@PathVariable String productId);
}
