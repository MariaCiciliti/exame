import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class CachorroAdapter {


    public class CachorroAdapter extends RecyclerView.Adapter<CachorroAdapter.CachorroViewHolder> {

        private List<Cachorro> cachorros;

        public CachorroAdapter(List<Cachorro> cachorros) {
            this.cachorros = cachorros;
        }

        @NonNull
        @Override
        public CachorroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cachorro, parent, false);
            return new CachorroViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CachorroViewHolder holder, int position) {
            Cachorro cachorro = cachorros.get(position);
            holder.txtNome.setText(cachorro.getNome());
            holder.txtIdade.setText(String.valueOf(cachorro.getIdade()));
        }

        @Override
        public int getItemCount() {
            return cachorros.size();
        }

        public static class CachorroViewHolder extends RecyclerView.ViewHolder {
            TextView txtNome, txtIdade;

            public CachorroViewHolder(@NonNull View itemView) {
                super(itemView);
                txtNome = itemView.findViewById(R.id.txtNome);
                txtIdade = itemView.findViewById(R.id.txtIdade);
            }
        }
    }
}
