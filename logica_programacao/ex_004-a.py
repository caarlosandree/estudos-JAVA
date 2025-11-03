from scipy.constants import convert_temperature

temperatura=float(input("Digite a temperatura em Celsius: "))

fahrenheit=convert_temperature(temperatura, "C", "F")
print(f"A temperatura em Fahrenheit é: {fahrenheit}")