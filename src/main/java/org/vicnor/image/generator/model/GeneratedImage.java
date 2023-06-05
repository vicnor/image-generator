package org.vicnor.image.generator.model;

public class GeneratedImage {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "GeneratedImage{"
                + " url='" + url + '\''
                + '}';
    }
}
