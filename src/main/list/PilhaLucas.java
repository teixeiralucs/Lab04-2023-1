package list;

public class PilhaLucas implements Pilha {
    private ListaArray list;

    public PilhaLucas() {
        list = new ListaArray();
    }
    
    @Override
    public boolean isEmpty(){
        int[] array = list.getArray();
        if(array.length <= 0){
            return true;
        }
    return false;
    }

    @Override
    public void push(int item){
        list.insereFim(item);
    }

    @Override
    public int pop(){
        int indice_fim = list.getIndiceFim();
        int record = list.buscaIndice(indice_fim);
        list.removeFim();
        return record;
    }
}