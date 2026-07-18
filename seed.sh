#!/bin/bash
echo "⏳ Attendo 15 secondi che l'API Gateway e i microservizi siano operativi..."
sleep 15

echo "👤 Registrazione Admin..."
curl -s -X POST http://localhost/api/v1/auth/register \
-H "Content-Type: application/json" \
-d '{"nome": "System Admin", "email": "admin@test.com", "password": "test123"}' > /dev/null

echo -e "\n👤 Registrazione Developer..."
curl -s -X POST http://localhost/api/v1/auth/register \
-H "Content-Type: application/json" \
-d '{"nome": "Test Developer", "email": "developer@test.com", "password": "test123"}' > /dev/null

echo -e "\n🔐 Promozione account admin a database..."
docker exec -i auth-db psql -U postgres -d auth_db -c "UPDATE user_credentials SET role = 'ADMIN' WHERE email = 'admin@test.com';"

echo "✅ Seeding completato con successo!"
