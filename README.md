# 🪙 Conversor de Moedas — Java + ExchangeRate API

## 📖 Descrição
Este projeto é um **conversor de moedas em Java** que utiliza a **[ExchangeRate API](https://www.exchangerate-api.com/)** para obter as cotações mais recentes em tempo real.  
O programa oferece um menu interativo no terminal, permitindo converter valores entre **Real (BRL)**, **Dólar (USD)**, **Peso Argentino (ARS)** e **Peso Colombiano (COP)** de forma dinâmica.

---

## ⚙️ Funcionalidades
- Consulta automática das taxas de câmbio mais recentes a partir da ExchangeRate API.  
- Conversões entre diferentes pares de moedas:
  - USD ↔️ ARS  
  - USD ↔️ BRL  
  - USD ↔️ COP  
  - BRL ↔️ USD  
- Menu interativo com repetição até o usuário escolher sair.  
- Exibição das taxas atuais ao final da execução.  

---

## 🧠 Tecnologias Utilizadas
- **Linguagem:** Java 17+  
- **Biblioteca JSON:** [Gson (Google)](https://github.com/google/gson)  
- **API de câmbio:** [ExchangeRate API](https://www.exchangerate-api.com/)  
- **Requisições HTTP:** `java.net.http.HttpClient`

---

## 🧩 Estrutura do Projeto

📦 conversor-moedas
---
┣ 📜 Main.java # Classe principal com menu interativo <br/>
┣ 📜 ConsultaCotacao.java # Faz a requisição HTTP à API <br/>
┣ 📜 MoedasConversao.java # Modelo que mapeia o JSON de resposta <br/>
┣ 📜 ConversorMoedas.java # Lógica matemática das conversões <br/>
┗ 📜 README.md # Documentação do projeto <br/>
---

## 💻 Exemplo de Execução

Seja bem vindo ao Conversor de Moedas!

1 - Dólar >> Peso argentino <br/>
2 - Peso argentino >> Dólar <br/>
3 - Dólar >> Real brasileiro <br/>
4 - Real brasileiro >> Dólar <br/>
5 - Dólar >> Peso colombiano <br/>
6 - Peso colombiano >> Dolar <br/>
7 - Sair <br/>
Escolha uma opção válida: <br/>

1 <br/>
Digite o valor que deseja converter: <br/>
100 <br/>

Valor: 100.0 [USD] corresponde ao valor final de >> 88383.27 <br/>

---


Ao sair, o programa exibe: <br/>

Cotações atuais (base: BRL): <br/>
USD: 0.175, ARS: 154.67, COP: 742.54, BRL: 1.0 <br/>
Obrigado por usar o programa! <br/>

---

## 🧮 Fórmula de Conversão
A conversão entre duas moedas **não-base** segue a fórmula: <br/>

valorDestino = (valorOrigem / taxaOrigem) × taxaDestino <br/>


Exemplo: <br/>
> Converter 1 USD para ARS: <br/>
> `1 ÷ 0.175 × 154.67 = 883.83 ARS` <br/>

---

## 🔑 Configuração da API
O código usa um endpoint gratuito da ExchangeRate API: <br/>

```java
https://v6.exchangerate-api.com/v6/SUA-CHAVE-AQUI/latest/BRL

⚠️ Substitua SUA-CHAVE-AQUI pela sua chave pessoal obtida em
https://www.exchangerate-api.com/
```
---

##🧑‍💻 Autor

Kaue Siqueira <br/>
Desenvolvido para o Challenge da formação <br/> Java e Orientação a Objetos da Alura no Programa ORACLE Next Education - Turma-G9
