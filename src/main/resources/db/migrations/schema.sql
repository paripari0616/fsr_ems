-- m_code テーブル
DROP TABLE IF EXISTS public.m_code CASCADE;
CREATE TABLE public.m_code (
  id integer NOT NULL,
  type character varying(20) NOT NULL,
  code integer NOT NULL,
  name character varying(30) NOT NULL,
  PRIMARY KEY (id)
);
COMMENT ON TABLE public.m_code IS 'マスタコード';

-- t_user テーブル
DROP TABLE IF EXISTS public.t_user CASCADE;
CREATE TABLE public.t_user (
  id serial,
  username character varying(40) NOT NULL,
  realname character varying(40) NOT NULL,
  password character varying(40) NOT NULL,
  gender character varying(8) NOT NULL,
  age integer,
  birthday date,
  address character varying(30),
  phonenumber character varying(20),
  createdate date,
  createuser character varying(40),
  updatedate date,
  updateuser character varying(40),
  PRIMARY KEY (username)
);
COMMENT ON TABLE public.t_user IS 'ユーザ';

-- t_emp テーブル
DROP TABLE IF EXISTS public.t_emp CASCADE;
CREATE TABLE public.t_emp (
  id serial NOT NULL,
  userid integer NOT NULL,
  securityid character varying(10),
  deviceid character varying(9),
  salary character varying(30) NOT NULL,
  createdate date,
  createuser character varying(40),
  updatedate date,
  updateuser character varying(40),
  PRIMARY KEY (id)
);
COMMENT ON TABLE public.t_emp IS '雇員';

-- PARTY_B テーブル
DROP TABLE IF EXISTS public.PARTY_B CASCADE;
CREATE TABLE public.PARTY_B (
    id serial,
    COMPANY_ID VARCHAR NOT NULL,
    ADDRESS VARCHAR NOT NULL,
    TEL integer NOT NULL,
    FAX integer NOT NULL,
    REV_NO integer NOT NULL,
    CRT_DATE TIMESTAMP NOT NULL,
    CRTPRSN_ID CHAR(20) NOT NULL,
    UPD_DATE TIMESTAMP NOT NULL,
    UPDPRSN_ID CHAR(20) NOT NULL,
    DEL_FLG CHAR(1) NOT NULL,
    DEL_DATE TIMESTAMP NOT NULL,
    DELPRSN_ID CHAR(20) NOT NULL
);
COMMENT ON TABLE public.PARTY_B IS '乙方';

