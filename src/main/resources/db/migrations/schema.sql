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
