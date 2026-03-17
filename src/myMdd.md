```mermaid
   classDiagram
    class Musico {
        +String nombre
    }
    class Guitarrista {
        +tocarSolo()
    }
    class Guitarra {
        -String marca
    }
    class Cuerda {
        -int tension
    }

   Musico <|-- Guitarrista: Herencia
   Guitarrista o-- Guitarra : Composicion
   Guitarra *-- Cuerda : Asociacion