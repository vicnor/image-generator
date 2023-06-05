package org.vicnor.image.generator.service;

import org.vicnor.image.generator.model.GenerateImageRequest;
import org.vicnor.image.generator.model.GenerateImageResponse;

public interface ImageGeneratorService {
    GenerateImageResponse generateImage(GenerateImageRequest request);
}
