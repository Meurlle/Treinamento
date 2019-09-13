package Treinamento

class Funcao {
	
	List<Integer> minhaFuncao (array){
		Integer n = array.size
		for (int i=0; i < array.size; i++) {
			for (int j=1; j < n-i; j++) {
				if(array[j-1]>array[j]) {
					Integer aux= array[j-1]
					array[j-1] = array[j]
					array[j]=aux
				}
			}
		}
		array
	 }
}
