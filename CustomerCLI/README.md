# Customer CLI

This Java program collects the first name, last name, and email of two customers and then displays their stored information.

## Docker

Build the Docker image:

```bash
docker build -t ronald-java-cli .
```

Run the program:

```bash
docker run --rm -it ronald-java-cli
```

## Example Output

```text
Stored Customers:
Name: Ronald Donald, Email: ronald@example.com
Name: John Smith, Email: john@example.com
```
