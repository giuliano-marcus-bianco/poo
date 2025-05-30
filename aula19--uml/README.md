```mermaid
classDiagram
    class Aviao {
    - maxTripulantes: int
    - maxPassageiros: int
    - pesoMaximo: double
    - combustivelMaximo: double
    - motores: ArrayList~Motor~
    }
    class Motor {
    - tipoTurbina: String
    - ligado: boolean
    }
    Aviao *-- Motor
```