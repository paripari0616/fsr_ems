-- m_code データ
INSERT INTO public.m_code (id, type, code, name) VALUES
(1, 'gender', 0, '男性'),
(2, 'gender', 1, '女性'),
(3, 'gender', 2, 'その他');

-- t_user データ
INSERT INTO public.t_user (id, username, realname, password, gender) VALUES
(8, '123', '123', '123', '0');
