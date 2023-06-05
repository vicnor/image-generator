package org.vicnor.image.generator.model;

import java.util.List;

public class GenerateImageResponse {
    private List<GeneratedImage> data;

    public List<GeneratedImage> getData() {
        return data;
    }

    public void setData(List<GeneratedImage> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenerateImageResponse{"
                + " data=" + data
                + '}';
    }
}
