// POST
fetch("http://localhost:8080/api/create", {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify({
    name: "Maçã",
    quantidade: 30
  })
}).then(response => {
  if (!response.ok) throw new Error("Erro ao criar item!");
  return response.text();
}).then(() => console.log("Item criado com sucesso")).catch(error => console.error("Erro:", error.message));

// GET
fetch("http://localhost:8080/api/check").then(response => {
  if (!response.ok) throw new Error("Erro ao buscar itens!");
  return response.json();
}).then(data => {
  console.log("Itens encontrados:", data);
}).catch(error => {
  console.error("Erro:", error.message);
});

// PUT
fetch(`http://localhost:8080/api/edit/4`, {
  method: "PUT",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify({
    name: "Maçã Verde",
    quantidade: 45
  })
}).then(response => {
  if (!response.ok) throw new Error("Erro ao editar item!");
  return response.text();
}).then(() => console.log("Item editado com sucesso")).catch(error => console.error("Erro:", error.message));

// DELETE
fetch(`http://localhost:8080/api/delete/4`, {
  method: "DELETE"
}).then(response => {
  if (!response.ok) throw new Error("Erro ao deletar item!");
  return response.text();
}).then(() => console.log("Item deletado com sucesso")).catch(error => console.error("Erro:", error.message));