INSERT INTO role_security1 (name)
SELECT 'ROLE_ADMIN'
WHERE NOT EXISTS (
    SELECT 1
    FROM role_security1
    WHERE name = 'ROLE_ADMIN'
);

INSERT INTO role_security1 (name)
SELECT 'ROLE_USER'
WHERE NOT EXISTS (
    SELECT 1
    FROM role_security1
    WHERE name = 'ROLE_USER'
);

INSERT INTO user_security1 (email,password)
SELECT 'dbuser@gmail.com','$2a$10$GpcqfPOYuXMbAxxRiJIYV.7zBZDtiTLOJ4p5TzI88GaRQ52Nltky2'
WHERE NOT EXISTS (
    SELECT 1
    FROM user_security1
    WHERE email = 'dbuser@gmail.com'
);

INSERT INTO role_user1 (uid,rid)
SELECT 1,1
WHERE NOT EXISTS (
    SELECT 1
    FROM role_user1
    WHERE uid = 1 and rid = 1
);


INSERT INTO role_user1 (uid,rid)
SELECT 1,2
WHERE NOT EXISTS (
    SELECT 1
    FROM role_user1
    WHERE uid = 1 and rid = 2
);
