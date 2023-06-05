package org.vicnor.image.generator.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.vicnor.image.generator.config.ImageGeneratorConfig;
import org.vicnor.image.generator.model.GenerateImageRequest;
import org.vicnor.image.generator.model.GenerateImageResponse;

@FeignClient(name = "imageGenerator", url = "${openai.image-generator.url}", configuration = ImageGeneratorConfig.class)
public interface ImageGeneratorClient {

    @PostMapping(value = "/v1/images/generations")
    GenerateImageResponse generateImage(@RequestBody final GenerateImageRequest request);
}
