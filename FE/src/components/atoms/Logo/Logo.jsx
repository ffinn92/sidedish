import logo from "@/assets/image/logo.svg";
import { Figure } from "@/components/atoms/Figure/Figure.jsx";
<<<<<<< HEAD
<<<<<<< HEAD

export function Logo({ className }) {
  return <Figure className={className} src={logo} alt="logo" />;
=======
import "./Logo.scss";

export function Logo() {
  return <Figure className="logo" src={logo} alt="logo" />;
>>>>>>> 0847aee ([#31] Feat: Header 컴포넌트에 Atomic Design Pattern 적용)
=======

export function Logo({ className }) {
  return <Figure className={className} src={logo} alt="logo" />;
>>>>>>> eb70272 ([#39] Feat: Header 컴포넌트에 styled-components 적용)
}
