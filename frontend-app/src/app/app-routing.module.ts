import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', loadChildren: './auth/pages/login/login.module#LoginPageModule' },
  { path: 'cadastro', loadChildren: './auth/pages/cadastro/cadastro.module#CadastroPageModule' },
  { path: 'home', loadChildren: './pages/home/home.module#HomePageModule' },
  { path: 'carrinho', loadChildren: './pages/carrinho/carrinho.module#CarrinhoPageModule' },
  { path: 'produto', loadChildren: './pages/produto/produto.module#ProdutoPageModule' },
  { path: 'checkout', loadChildren: './pages/pagamentos/checkout/checkout.module#CheckoutPageModule' },
  { path: 'minha-conta', loadChildren: './pages/conta-usuario/minha-conta/minha-conta.module#MinhaContaPageModule' },  { path: 'meus-pedidos', loadChildren: './pages/conta-usuario/meus-pedidos/meus-pedidos.module#MeusPedidosPageModule' },
  { path: 'meus-enderecos', loadChildren: './pages/conta-usuario/meus-enderecos/meus-enderecos.module#MeusEnderecosPageModule' },



];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
