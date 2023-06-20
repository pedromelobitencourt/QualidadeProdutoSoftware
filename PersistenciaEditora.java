import java.util.ArrayList;
import java.util.HashMap;

public final class PersistenciaEditora {
    private static PersistenciaEditora persistenciaEditora;
    private HashMap<String, Editora> editoras; // O(1) : Não pode ter mais de uma editora com o mesmo nome

    private PersistenciaEditora() {
        editoras = new HashMap<String, Editora>();
    }

    public static PersistenciaEditora getInstance() {
        if(persistenciaEditora == null) persistenciaEditora = new PersistenciaEditora();

        return persistenciaEditora;
    }

    public void cadastrarEditora(Editora editora) {
        String nomeEditora = editora.getNome();

        editoras.put(nomeEditora, editora);
    }

    public HashMap<String, Editora> getEditoras() {
        return editoras;
    }
}
