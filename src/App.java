public class App {
    public static void mergeSort(int [] arr, int left, int right){
        if (left < right){
            // encontrar el punto medio
            int mid= (left + right) / 2;

            //se ordena a la izq
            mergeSort(arr, left, mid);

            //derecha
            mergeSort (arr, mid +1, right);

            //se combina las mitades ordenadamente
            merge(arr, left, mid, right);

        }
    }
}
