-- m_code データ
INSERT INTO public.m_code (id, type, code, name) VALUES
(1, 'gender', 0, '男性'),
(2, 'gender', 1, '女性'),
(3, 'gender', 2, 'その他');

-- t_user データ
INSERT INTO public.t_user (id, username, realname, password, gender) VALUES
(8, '123', '123', '123', '0');

-- t_emp テーブル
INSERT INTO public.PARTY_B (COMPANY_ID, ADDRESS, TEL, FAX) VALUES
(1, 'ＦＳＲ株式会社', '〒110-000 東京都台東区上野3-19-4 KEN BUILDING 5階', '03-6876-0986', '03-6876-0986 ');