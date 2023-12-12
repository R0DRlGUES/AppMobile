package controller;


import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

import dao.PaisDao;
import model.Pais;
import retrofit.RetrofitConfig;
import dto.PaisDTO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class PaisController {
    private Context context;
    public static void getViaPais(int codigo, String descricao,TextView tvListaPais){
        try{
            retrofit2.Call<ArrayList <PaisDTO>> call = new RetrofitConfig().paisService().getPaisDtoCall();
            call.enqueue(new Callback<ArrayList<PaisDTO>>() {
                @Override
                public void onResponse(Call<ArrayList<PaisDTO>> call, Response<ArrayList<PaisDTO>> response) {
                    ArrayList<PaisDTO> listaPais = response.body();

                    for (int i = 0 ; i <listaPais.size(); i++){
                        salvar();

                    }
                }
                @Override
                public void onFailure(Call<ArrayList<PaisDTO>> call, Throwable t) {
                }
            });
        }catch (Exception ex){}
    }
    public String salvar(int codigo, String descricao){
        try {
            Pais pais = new Pais();
            pais.setCodio(codigo);
            pais.setDescricao(descricao);
            PaisDao.getInstancia(context).insert(pais);
        } catch (Exception ex) {
            return "Erro ao gravar pais." + ex.getMessage();
        }
        return null;
    }
    public void retornar(){
        ArrayList<PaisDTO> listaPais;
        for (int i = 0 ; i <listaPais.size(); i++){

        }

    }

}
