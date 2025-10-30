package com.lmz.aiagent.demo.invoke;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONObject;
import com.alibaba.dashscope.utils.ApiKey;

/*阿里云灵积http调用*/
public class HttpAiInvoke {

    public static void main(String[] args) {
        String apiKey = TestApiKey.API_KEY;
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("请设置环境变量 DASHSCOPE_API_KEY");
            return;
        }

        String url = "https://dashscope.aliyuncs.com/api/v1/services/aigc/text-generation/generation";

        // 直接构建JSON字符串
        String requestBody = """
            {
                "model": "qwen-plus",
                "input": {
                    "messages": [
                        {
                            "role": "system",
                            "content": "You are a helpful assistant."
                        },
                        {
                            "role": "user",
                            "content": "你是谁？"
                        }
                    ]
                },
                "parameters": {
                    "result_format": "message"
                }
            }
            """;

        try {
            HttpResponse response = HttpRequest.post(url)
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .execute();

            if (response.isOk()) {
                System.out.println("响应成功:");
                System.out.println(response.body());
            } else {
                System.err.println("请求失败: " + response.getStatus());
                System.err.println(response.body());
            }

        } catch (Exception e) {
            System.err.println("请求异常: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

