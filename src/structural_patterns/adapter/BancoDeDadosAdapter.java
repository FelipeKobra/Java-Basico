package structural_patterns.adapter;

import java.util.List;

public class BancoDeDadosAdapter extends BancoDeDadosDaApi {
    BancoDeDados bancoDeDados;
    int id;
    float size;
    String nome;

    BancoDeDadosAdapter(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    @Override
    void getInfo() {
        List<String> info = bancoDeDados.getInfo();
        id = adaptarId(info.get(0));
        nome = info.get(1);
        size = adaptarSize(info.get(2));
    }

    @Override
    void sendInfo() {
        getInfo();
        super.sendInfo();
    }

    static private int adaptarId(String id) {
        return Integer.parseInt(id);
    }

    static private float adaptarSize(String size) {
        String sizeSemLetra = size.replaceAll("[^0-9]", "");
        return Float.parseFloat(sizeSemLetra);
    }

}
