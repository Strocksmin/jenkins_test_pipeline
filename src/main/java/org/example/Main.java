package org.example;

import okhttp3.*;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "S001_F000=Bank&S001_F001=on&g-recaptcha-response=03AFcWeA7RG72MethSBpxJScu2Sv3gxXKaPq6Te_yMOZh6--NFE6jicmxPusdaoB2Fzx4En-VP2c-41nwzNkRtadpBa_VuX62GKkpRH59r8n7Dghfck5ugvgdBI29_0wpBxLEZIRo-wJOQ53chDSX5FrmMNSREoWI1mNIZRWulaYjFr9mR43uh-ZTpnMG9A3Bg3BWfM_svSxZJkDk8I4ro-eSUwKrLgppRHUb4XyA2yn5eS3s5-EXpeLLe6mN0WATdYkgKDcHJmuy9UsfcAAazk3iEWqnVnQ3L6Fo-fn0zeK-HA5Nm0uago-S8hexVHk-UhtxeF4Rr9a4258xLgJfj8WWiLV5RwnonC6esSWjhgtuLeIfsiqoxKTDXxNMqFLeqgZK--pg2ER6WVWe4IV5VCWAJzpLrooIG_AyuEJsyrAO-qln-rPZ8uiyjeU09YK9RfnZZZqL6RWdNuDbCBtPN67lLuQGnSOkkYm5FWAhD-3kwNRxTd9ie0z1Ew_IeQ0zde9YeBl4ltq4qzlzEstYSRrMz6yhe46HntZTDp_Y_98-f8SOf34Qsd2ImmJfWoMU1fsXICcAOJ2kDZXLRP-VR_IxhNzf4DBr5MmGlWeKEO6bdK0l6y5Akn9iAD9FM_gKwO2-XAfQ2RzaJso9b8DgZwVsgb-BjSxrlyoSmMCQCtKN-jAzOBeEdHEXmUKtdvAgZu_CXij-XgTJetQxgxpyvOOjDSMocPHDwcFpqWu-brGbZshCkQ4VCsY_jwCFrUBOQdrcq1Sake10QbBoFVnipiYwDvRAtUd-G8dEaGBxjOxTxTT3q9Q9X85J7J_kTONs9gBh3oMPJ8evO33r6OHST81rIJPxOGegKcqN0eKIqRXDYFOLK0oWaLcFX3ObtTAxkduzkJrvHs2sG_QhlPqZ3FQu8DTpKBWRcvA&captcha-response=03AFcWeA7RG72MethSBpxJScu2Sv3gxXKaPq6Te_yMOZh6--NFE6jicmxPusdaoB2Fzx4En-VP2c-41nwzNkRtadpBa_VuX62GKkpRH59r8n7Dghfck5ugvgdBI29_0wpBxLEZIRo-wJOQ53chDSX5FrmMNSREoWI1mNIZRWulaYjFr9mR43uh-ZTpnMG9A3Bg3BWfM_svSxZJkDk8I4ro-eSUwKrLgppRHUb4XyA2yn5eS3s5-EXpeLLe6mN0WATdYkgKDcHJmuy9UsfcAAazk3iEWqnVnQ3L6Fo-fn0zeK-HA5Nm0uago-S8hexVHk-UhtxeF4Rr9a4258xLgJfj8WWiLV5RwnonC6esSWjhgtuLeIfsiqoxKTDXxNMqFLeqgZK--pg2ER6WVWe4IV5VCWAJzpLrooIG_AyuEJsyrAO-qln-rPZ8uiyjeU09YK9RfnZZZqL6RWdNuDbCBtPN67lLuQGnSOkkYm5FWAhD-3kwNRxTd9ie0z1Ew_IeQ0zde9YeBl4ltq4qzlzEstYSRrMz6yhe46HntZTDp_Y_98-f8SOf34Qsd2ImmJfWoMU1fsXICcAOJ2kDZXLRP-VR_IxhNzf4DBr5MmGlWeKEO6bdK0l6y5Akn9iAD9FM_gKwO2-XAfQ2RzaJso9b8DgZwVsgb-BjSxrlyoSmMCQCtKN-jAzOBeEdHEXmUKtdvAgZu_CXij-XgTJetQxgxpyvOOjDSMocPHDwcFpqWu-brGbZshCkQ4VCsY_jwCFrUBOQdrcq1Sake10QbBoFVnipiYwDvRAtUd-G8dEaGBxjOxTxTT3q9Q9X85J7J_kTONs9gBh3oMPJ8evO33r6OHST81rIJPxOGegKcqN0eKIqRXDYFOLK0oWaLcFX3ObtTAxkduzkJrvHs2sG_QhlPqZ3FQu8DTpKBWRcvA");
        Request request = new Request.Builder()
                .url("https://www.kcci.org.kw/newweb/members/search")
                .method("POST", body)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}