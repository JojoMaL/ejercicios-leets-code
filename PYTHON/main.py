from solution import Solution

if __name__ == "__main__":
    # Ejemplo de prueba para two_sum
    nums = [2,7,11,15]
    target = 9
    sol = Solution() #este valor me causa conflicto.
    result = sol.twoSum(nums, target)
    print(f"Entrada: nums={nums}, target={target}")
    print(f"Salida: {result}")
    # Debería imprimir: Salida: [0, 1]


#EJEMPLO PRUEBA PARA REMOVE ELEMENT
nums = [3,2,2,3]
val = 3 
result = sol.removeElement(nums,val)
print(f"Entrada: nums={nums}, Val={val}")
print(f"Salida: {result}")