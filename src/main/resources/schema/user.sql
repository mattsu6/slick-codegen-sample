CREATE TABLE IF NOT EXISTS test_db.`user`(
  `id` INT UNSIGNED NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `age` TINYINT UNSIGNED,
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;