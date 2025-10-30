package com.lmz.aiagent.tools;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

public class ResourceDownloadToolTest {

    @Test
    public void testDownloadResource() {
        ResourceDownloadTool tool = new ResourceDownloadTool();
        String url = "https://images.pexels.com/photos/14508039/pexels-photo-14508039.jpeg";
        String fileName = "logo.png";
        String result = tool.downloadResource(url, fileName);
        assertNotNull(result);
    }
}