package list;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < indice_fim; i++)
        if (array[i] == valor)
            return true;
    return false;
    }

    @Override
    public int buscaIndice(int valor) {
        if ((valor < 0) || (valor >= indice_fim)){
            return -1;
        }
        return array[valor];
    }
    

    @Override
    public int minimo() {
        int minimo = array[0];
        for (int i = 1; i < indice_fim; i++){
            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }

    @Override
    public int maximo() {
        int maximo = array[0];
        for (int i = 0; i < indice_fim; i++){
            if (array[i] > maximo){
                maximo = array[i];
            }
        }
        return maximo;
    }

    @Override
    public int predecessor(int valor) {
        for (int i = 0; i < indice_fim; i++){
            if (array[i] == valor){
                return array[i-1];
            }
        }
        return -1;
    }

    @Override
    public int sucessor(int valor) {
       for (int i = 0; i < indice_fim; i++){
            if (array[i] == valor){
                return array[i+1];
    }
}
return -1;
    }

    @Override
    public void insereElemento(int valor) {
        array[indice_fim]=valor;
        indice_fim++;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
    }

    @Override
    public void insereInicio(int valor) {
        for (int i = indice_fim - 1; i > 0; i--)
            array[i] = array[i+1];
        array[0] = valor;
    }

    @Override
    public void insereFim(int valor) {
        array[indice_fim]=valor;
        indice_fim++;
    }

    @Override
    public void remove(int valor) {
        for (int i = 0; indice_fim < i; i++){
            if (array[i]==valor){
                removeIndice(i);
            }
        }
    }

    @Override
    public void removeIndice(int indice) {
        for(int i = indice; i < indice_fim; i++){
            array[i] = array[i++];
            indice_fim--;
        }
    }

    @Override
    public int removeInicio(num) {
        for (int i = 0; i < indice_fim; i++) {
            array[i] = array[i + 1];
        }
        return num;
    }

    @Override
    public void removeFim() {
        if (indice_fim > 0){
            array[indice_fim - 1] = 0;
            indice_fim--;
        }
    }
    public int getIndiceFim(){
        return this.indice_fim;
    }
    public int[] getArray(){
        return this.array;
    }
}