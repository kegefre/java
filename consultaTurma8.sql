select * from fornecedor;

select nome from fornecedor;

select oc.id, oc.data, f.nome, f.ie from fornecedor as f, ordem_compra as oc where oc.idFornecedor=f.id;

select oc.id, oc.data, f.nome, f.ie from fornecedor as f, ordem_compra as oc where oc.idFornecedor=f.id order by f.ie;

select oc.id, oc.data, f.nome, f.ie from fornecedor as f, ordem_compra as oc where oc.idFornecedor=f.id order by f.ie desc;

select ioc.idOrdemCompra, ioc.idMaterial, m.nome from item_ordem_compra as ioc, material as m where ioc.idMaterial = m.id;

select ioc.idOrdemCompra, ioc.idMaterial, m.nome from item_ordem_compra as ioc, material as m where ioc.idMaterial = m.id order by ioc.idOrdemCompra;

--Exercicios:
--1. Exiba os dados da compra (item_ordem_compra) de todos os materiais cujo quantidade seja maior que 10. 
select * from item_ordem_compra where quantidade > 10;

--2. Exiba os dados da compra (item_ordem_compra) de todos os materiais cujo valor seja menor que 50.

select * from item_ordem_compra where quantidade > 10 and valor <50;

--3. Exibir os dados da compra de todos os materiais cuja quantidade seja maior que 100 e o valor seja menor que 50, contendo o nome do material e o nome do fornecedor.

SELECT ioc.idOrdemCompra, ioc.idMaterial, ioc.quantidade, m.nome, f.nome FROM item_ordem_compra as ioc, material as m, fornecedor as f, ordem_compra as o 
WHERE ioc.quantidade>100 
and ioc.valor <50 
and ioc.idMaterial=m.id 
and ioc.idOrdemCompra = o.id
and o.idFornecedor = f.id;

--4. Exiba o subtotal de cada material vendido, o nome do material e o nome do fornecedor para cada item ordem compra.
SELECT ioc.valor*ioc.quantidade as subtotal, m.nome, f.nome
FROM item_ordem_compra as ioc, material as m, fornecedor as f, ordem_compra as o 
WHERE ioc.idMaterial=m.id
and ioc.idOrdemCompra = o.id
and o.idFornecedor = f.id;


SELECT idOrdemCompra, SUM(quantidade * valor) as totalCompra from item_ordem_compra group by idOrdemCompra;


SELECT idOrdemCompra, SUM(quantidade * valor) as totalCompra 
from item_ordem_compra
group by idOrdemCompra
having totalCompra > 5000;

-- 5. O nome do fornecedor da ordem de compra, a ordem de compra e o total pago pela ordem de compra.
SELECT f.nome, o.id, SUM(quantidade * valor) as totalCompra
from item_ordem_compra as ioc, ordem_compra as o, fornecedor as f
WHERE o.id=ioc.idOrdemCompra
and o.idFornecedor = f.id
group by idOrdemCompra;

-- 6. O nome do fornecedor da ordem de compra, a data da ordem de compra, o total pago pela ordem de compra, num determinado intervalo de datas.
SELECT f.nome, o.data, SUM(quantidade * valor) as totalCompra 
from item_ordem_compra as ioc, ordem_compra as o, fornecedor as f
WHERE o.id=ioc.idOrdemCompra
and o.idFornecedor = f.id
and o.data BETWEEN '2022-05-15' and '2022-05-20'
group by ioc.idOrdemCompra;