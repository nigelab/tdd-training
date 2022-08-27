# SuperSecretTextEncoder

## Behavior-based
- Zero
  - encode 0 char
- One
- Many
  - encode a string
  - encode empty string
- Boundary behaviors
- Interface definition
- Exceptional behaviors
  - encode null throws IllegalArgumentException
- Simple scenarios, solutions

## Encryption module

### PlainText Encryption implementation
- encrypt return same as input
- encrypt null throws IllegalArgumentException

### ROT13 Encryption implementation
- encrypt 1 letter
- encrypt 1 number
- encrypt letter and number
- encrypt null throws IllegalArgumentException
