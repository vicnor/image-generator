package org.vicnor.image.generator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.vicnor.image.generator.common.util.ValidSize;

public class GenerateImageRequest {

    @NotBlank
    private String prompt;

    @ValidSize
    private String size;

    @Min(1)
    @Max(10)
    @JsonProperty("num_images")
    private int numImages;

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumImages() {
        return numImages;
    }

    public void setNumImages(int numImages) {
        this.numImages = numImages;
    }

    @Override
    public String toString() {
        return "GenerateImageRequest{"
                + " prompt='" + prompt + '\''
                + ", size='" + size + '\''
                + ", numImages=" + numImages
                + '}';
    }
}
