package org.vicnor.image.generator.service;

import org.springframework.stereotype.Service;
import org.vicnor.image.generator.model.GenerateImageRequest;
import org.vicnor.image.generator.model.GenerateImageResponse;
import org.vicnor.image.generator.service.external.ImageGeneratorClient;

@Service
public class ImageGeneratorServiceImpl implements ImageGeneratorService {
    private final ImageGeneratorClient client;

    public ImageGeneratorServiceImpl(ImageGeneratorClient client) {
        this.client = client;
    }

    @Override
    public GenerateImageResponse generateImage(GenerateImageRequest request) {
        return client.generateImage(request);
    }
}
