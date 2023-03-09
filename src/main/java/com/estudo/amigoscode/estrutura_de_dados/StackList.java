package com.estudo.amigoscode.estrutura_de_dados;

import java.util.ArrayList;
import java.util.List;

import com.estudo.amigoscode.estrutura_de_dados.exceptions.StackEmptyException;

public class StackList {
    /*  lógica de uma pilha/stack: Last In First out
    operações básicas em uma pilha
    adicionar no final da pilha - push
    remover último elemento da pilha - pop
    mostra valor do último elemento da pilha - peek
    ver comprimento total - size
    checar se está vazia - isEmpty
    esvaziar a pilha - clear
    checa se elemento está na pilha - checkPosition
    */
   private List<Integer> list = new ArrayList<Integer>();

    public long size() {
        return this.list.size();
    }

   public void push(Integer value){
        this.list.add(value);
    }

    public int checkPosition(Integer value) throws StackEmptyException{
        if(this.list.isEmpty()) {
            final String exceptionText = "Erro, você não pode procurar a posição de elementos, pois a pilha está vazia.";
            throw new StackEmptyException(exceptionText);
        }
        // se a pilha não estiver vazia, vai retornar o indice do elemento na pilha
        final int i = this.list.indexOf(value);
        return i;
    }

    public int peek() throws StackEmptyException{
        if(this.list.isEmpty()) {
            final String exceptionText = "Erro, você não pode olhar o valor do elemento no topo da pilha pois ela está vazia.";
            throw new StackEmptyException(exceptionText);
        }
        final int value = this.list.get(this.list.size()).intValue();
        return value;
    }

   public int pop() throws StackEmptyException{
        if(this.list.isEmpty()) {
            final String exceptionText = "Erro, você não pode remover itens pois a pilha está vazia.";
            throw new StackEmptyException(exceptionText);
        }
        final int lastPosition = this.list.size() - 1;
        Integer lastElement = this.list.get(lastPosition);
        final int value = lastElement.intValue();
        this.list.remove(value);
        return value;
   }

   public void clear(){
    this.list.removeAll(list);
   }

   public boolean isEmpty(){
    final boolean result = this.list.isEmpty();
    return result;
   }

}
