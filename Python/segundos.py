total = int(input("Digite os segundos: "))

horas = total // 3600
minutos = (total % 3600) // 60
segundos = total % 60

print(horas, "hora(s),", minutos, "minuto(s) e", segundos, "segundo(s)")