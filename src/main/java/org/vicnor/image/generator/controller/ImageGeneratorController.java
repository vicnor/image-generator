package org.vicnor.image.generator.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vicnor.image.generator.model.GenerateImageRequest;
import org.vicnor.image.generator.model.GenerateImageResponse;
import org.vicnor.image.generator.service.ImageGeneratorService;

@RestController
@RequestMapping("/v1/images")
public class ImageGeneratorController {
    private static final Logger LOG = LoggerFactory.getLogger(ImageGeneratorController.class);

    private final ImageGeneratorService imageGeneratorService;

    public ImageGeneratorController(ImageGeneratorService imageGeneratorService) {
        this.imageGeneratorService = imageGeneratorService;
    }

    @PostMapping("generate")
    public GenerateImageResponse generateImage(@NotNull @Valid @RequestBody GenerateImageRequest request) {
        LOG.info("Received image generation request: {}", request);
        GenerateImageResponse response = imageGeneratorService.generateImage(request);
        LOG.info("Generated image: {}", response);
        return response;
    }
}
