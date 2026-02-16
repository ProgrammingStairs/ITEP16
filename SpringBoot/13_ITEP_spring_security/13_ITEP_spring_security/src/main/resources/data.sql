INSERT INTO role_security (name)
SELECT 'ROLE_ADMIN'
WHERE NOT EXISTS (
    SELECT 1
    FROM role_security
    WHERE name = 'ROLE_ADMIN'
);

INSERT INTO role_security (name)
SELECT 'ROLE_USER'
WHERE NOT EXISTS (
    SELECT 1
    FROM role_security
    WHERE name = 'ROLE_USER'
);

INSERT INTO user_security (username,password)
SELECT 'dbuser','$2a$10$GpcqfPOYuXMbAxxRiJIYV.7zBZDtiTLOJ4p5TzI88GaRQ52Nltky2'
WHERE NOT EXISTS (
    SELECT 1
    FROM user_security
    WHERE username = 'dbuser'
);

INSERT INTO role_user (uid,rid)
SELECT 1,1
WHERE NOT EXISTS (
    SELECT 1
    FROM role_user
    WHERE uid = 1 and rid = 1
);


INSERT INTO role_user (uid,rid)
SELECT 1,2
WHERE NOT EXISTS (
    SELECT 1
    FROM role_user
    WHERE uid = 1 and rid = 2
);
