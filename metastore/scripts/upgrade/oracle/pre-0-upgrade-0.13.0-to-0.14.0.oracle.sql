-- Oracle has no easy way to do CREATE TABLE IF NOT EXISTS compatible with SchemaTool, so do it here

CREATE TABLE PART_COL_STATS (
CS_ID NUMBER NOT NULL,
DB_NAME VARCHAR2(128) NOT NULL,
TABLE_NAME VARCHAR2(128) NOT NULL,
PARTITION_NAME VARCHAR2(767) NOT NULL,
COLUMN_NAME VARCHAR2(128) NOT NULL,
COLUMN_TYPE VARCHAR2(128) NOT NULL,
PART_ID NUMBER NOT NULL,
LONG_LOW_VALUE NUMBER,
LONG_HIGH_VALUE NUMBER,
DOUBLE_LOW_VALUE NUMBER,
DOUBLE_HIGH_VALUE NUMBER,
BIG_DECIMAL_LOW_VALUE VARCHAR2(4000),
BIG_DECIMAL_HIGH_VALUE VARCHAR2(4000),
NUM_NULLS NUMBER NOT NULL,
NUM_DISTINCTS NUMBER,
AVG_COL_LEN NUMBER,
MAX_COL_LEN NUMBER,
NUM_TRUES NUMBER,
NUM_FALSES NUMBER,
LAST_ANALYZED NUMBER NOT NULL);

ALTER TABLE PART_COL_STATS ADD CONSTRAINT PART_COL_STATS_PKEY PRIMARY KEY (CS_ID);

ALTER TABLE PART_COL_STATS ADD CONSTRAINT PART_COL_STATS_FK FOREIGN KEY (PART_ID) REFERENCES PARTITIONS (PART_ID) INITIALLY DEFERRED;

CREATE INDEX PART_COL_STATS_N49 ON PART_COL_STATS (PART_ID);
