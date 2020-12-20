package cl.jav.desafioperritosprueba.api;


import cl.jav.desafioperritosprueba.model.RazaImagen;
import cl.jav.desafioperritosprueba.model.Razaslista;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface Api {
    @GET("breeds/list/all")
    Call<Razaslista> listaRazas();
    @GET("breed/{breed}/images")
    Call<RazaImagen> listaImagenes(@Path("breed")String breed);
}

