create TABLE "profiles"
(
    "id"          UUID NOT NULL,
    "name"        varchar(256),
    "surname"     varchar(256),
    "created_at"  timestamp NOT NULL,
    "modified_at" timestamp NOT NULL
);