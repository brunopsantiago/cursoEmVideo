# cursoEmVideo
Curso em Video de Python 
https://www.youtube.com/channel/UCrWvhVmt0Qac3HgsjQK62FQ

from operator import add
operacao = input('Qual operacao deseja realizar ')
n1 = int(input('Digite numero 1: '))
n2 = int(input('Digite numero 2: '))
if operacao == 'Soma':
    res = n1 + n2
    print('soma = ', res)
if operacao == 'Sub':
    res = n1 - n2
    print('Sub = ', res)
if operacao == 'Mult':
    res = n1 * n2
    print('Mult = ', res)
if operacao == 'Div':
    res = n1 / n2
    print('Divisao = ', res)
