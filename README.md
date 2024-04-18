# Exercício 02

Considere o Objeto conta, com uma classe para testes e que tem como atributos, agencia:
int, código:int, saldo:int e limite: float, com um construtor default implementado e seus
getters e setters implementados. O objeto deve ter, também, implementados os métodos
deposita que recebe um float e soma o valor ao saldo disponível e saca, que recebe um float
e subtrai o valor do saldo disponível. O método saca tem uma limitação aritmética que deve
ser tratada em formato de exceção:
<br>• Não se pode sacar um valor maior que o saldo somado com o limite.
<br>• Nesse caso, deve se ter uma mensagem personalizada mostrando o limite total para
saque