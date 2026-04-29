INSERT INTO admin (email,password)
SELECT 'admin@gmail.com','$2a$10$GpcqfPOYuXMbAxxRiJIYV.7zBZDtiTLOJ4p5TzI88GaRQ52Nltky2'
WHERE NOT EXISTS (
    SELECT 1
    FROM admin
    WHERE email = 'admin@gmail.com'
);