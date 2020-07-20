package io;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NegociosApiAdapter {

        private static NegociosApiService API_SERVICE;

        public static NegociosApiService getApiService() {

            // Creamos un interceptor y le indicamos el log level a usar
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            // Asociamos el interceptor a las peticiones
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(logging);

            String baseUrl = "https://mi-pagina.com/api/";

            if (API_SERVICE == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(httpClient.build()) // <-- usamos el log level
                        .build();
                API_SERVICE = retrofit.create(NegociosApiService.class);
            }

            return API_SERVICE;
        }

    }

