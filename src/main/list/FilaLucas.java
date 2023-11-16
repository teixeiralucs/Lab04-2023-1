package list;

public class FilaLucas implements Fila {
    private ListaArray queue;

    public FilaLucas(){
        queue = new ListaArray();
    }
    @Override
    public void enqueue(int item){
        queue.insereFim(item);
    }
    
    @Override
    public int dequeue(){
        int num = queue.removeInicio();
        return num;
    }

    @Override
    public boolean isEmpty(){
        int[] array = queue.getArray();
        if(array.length <= 0){
            return true;
        }
        return false;
    }

    @Override
    public int size(){
        int indice_fim = queue.getIndiceFim();
        int contador = 0;
        for (int i=0; i<indice_fim; i++){
            contador++;
        }
        return contador;
    }
}
