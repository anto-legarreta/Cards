# Cards

### Ejercicio 1
- Resuelto en la clase de tests

### Ejercicio 2
- Servicio expuesto en CardController

#### Ejemplo de uso: 
URL: http://cards-env.eba-jxn8xasg.us-east-1.elasticbeanstalk.com/card/operation-fee    
Method: POST  
Body:
```
{
    "card": {
        "brandName": "VISA",
        "expirationDate": "2023-01-01",
        "number": 123456789,
        "cardholder": "PEPE GARCIA"
    },
    "operationAmount": 100
}
```
