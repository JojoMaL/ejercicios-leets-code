public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Solution
        Solution sol = new Solution();

        // Definir el arreglo de números y el objetivo
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Llamar al método twoSum para encontrar los índices de los números que suman el objetivo
        int[] result = sol.twoSum(nums, target);

        // Imprimir la entrada
        System.out.print("Entrada: nums=[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("] target=" + target);

        // Imprimir la salida
        if (result != null) {
            System.out.println("Salida: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Salida: null");
        }
        // Debería imprimir: Salida: [0, 1]
    }
}